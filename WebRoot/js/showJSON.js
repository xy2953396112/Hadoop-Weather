/**
 *  �õ����ص����
 */
$(document).ready(
$(function(){
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/showWeatherJSON",
                data: "json",    
                success: function(result){
                    alert(result);
                }
            });
            
        });
);