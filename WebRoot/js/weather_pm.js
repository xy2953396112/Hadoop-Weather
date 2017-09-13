/**
 * 
 */

//页面加载的 时候就提交
$(document).ready(function(){
	      alert("start");
            $.ajax({
                type: "GET",
                url: "http://www.pm25.in/api/querys/pm2_5.json",
                data: {"city":"taiyuan","token":"5j1znBVAsnSf5xQyNQyq"},   
                error:function{
                	alert("error");
                },
                success: function(result){
                    alert("result:"+result);
                    console.log("result:"+result)
                     $.ajax({	 
                    	 type: "post",
                         url: "login/insertWeatherJSON",
                         data: {"json":result},   
                         error:function{
                         	alert("error");
                         },
                     })
                }
            });
            
        });
