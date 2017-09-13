/**
 * 
 */
$(document).ready(
$(function(){
            $.ajax({
                type: "GET",
                url: "https://api.map.baidu.com/location/ip",
                data: {"ak":"4rcKAZKG9OIl0wDkICSLx8BA","coor":"bd09ll"},    
                success: function(str){
                	var x,y;  //分别代表精度和纬度
                	var obj = JSON.parse(str);
                	x = obj.content.point.x;
                	y = obj.content.point.y;
                    alert("精度x："+x,"纬度y:"+y);
                    document.getElementById("time").value = "L1kljdsafd";
                }
            });
            
        });
);