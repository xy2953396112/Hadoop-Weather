<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>可视化</title>
<meta charset=UTF-8>
</head>
<script type="text/javascript">
    

</script>
<body>
<div id="main" style="height:400px"></div>
<script src="js/echarts.js"></script>
<script src="js/jquery.js"></script>
 <script type="text/javascript">
    
    
    
    $(document).ready(function(){
    //alert("start");
      var low = new Array(7);     //低温
    var high = new Array(7);    //高温
      $.ajax({
          type: "GET",
          url: "http://localhost:8080/Hadoop-Weather/login/showWeekStatus",           //url请求
          error:function(){ alert("没有一周的天气数据！"); },
          success: function(data){       //返回的数据
    	      console.log(data);
    	      var tep= new Array(7);        //7天温度的数据
        	  var tem = data.showWeekStatus;   //得到太原一周内的气温变化数组         	   
        	  for(var i=0;i<tem.length;i++){
        	     tep[i] = tem[i].temperature;
        	  }
        	  for(var j=0;j<tep.length;j++){
        	     //18℃~6℃
        	     low.push((tep[j].split("~")[1]).split("℃"));                              //把温度最低的放入low
        	     high.push(tep[j].substr(0,1));        //把温度最高的放入high
        	  }
        	  
           }        
      })

   
    var myChart = echarts.init(document.getElementById('main'));
    
    option = {
    title: {
        text: '未来一周气温变化',
        subtext: '太原'
    },
    tooltip: {
        trigger: 'axis'
    },
    legend: {
        data:['最高气温','最低气温']
    },
    toolbox: {
        show: true,
        feature: {
            dataZoom: {
                yAxisIndex: 'none'
            },
            dataView: {readOnly: false},
            magicType: {type: ['line', 'bar']},
            restore: {},
            saveAsImage: {}
        }
    },
    xAxis:  {
        type: 'category',
        boundaryGap: false,
        data: ['周一','周二','周三','周四','周五','周六','周日']
    },
    yAxis: {
        type: 'value',
        axisLabel: {
            formatter: '{value} °C'
        }
    },
    series: [
        {
            name:'最高气温',
            type:'line',
            data: high,    //[11, 11, 15, 13, 12, 13, 10],
            markPoint: {
                data: [
                    {type: 'max', name: '最大值'},
                    {type: 'min', name: '最小值'}
                ]
            },
            markLine: {
                data: [
                    {type: 'average', name: '平均值'}
                ]
            }
        },
        {
            name:'最低气温',
            type:'line',
            data:low,       //[1, -2, 2, 5, 3, 2, 0],
            markPoint: {
                data: [
                    {name: '周最低', value: -2, xAxis: 1, yAxis: -1.5}
                ]
            },
            markLine: {
                data: [
                    {type: 'average', name: '平均值'},
                    [{
                        symbol: 'none',
                        x: '90%',
                        yAxis: 'max'
                    }, {
                        symbol: 'circle',
                        label: {
                            normal: {
                                position: 'start',
                                formatter: '最大值'
                            }
                        },
                        type: 'max',
                        name: '最高点'
                    }]
                ]
            }
        }
    ]
};
    

        myChart.setOption(option); 
        
 })
    </script>
</body>
</html>