/**
 *   对注册的条件进行校验
 */

function test(){
			
			var username=document.getElementById("username").value;
			var password=document.getElementById("password").value;
			var password1=document.getElementById("password1").value;
			var select = document.getElementById("sex").value;
			var address = document.getElementById("address").value;
			var phone = document.getElementById("phone").value;
			var pattern = /^['男'|'女']$/;
			//alert("sex:"+select);
			 if(username.length<3 || username.length>10){
			      alert("账号长度为3-10位数字或字母！");
			      //document.getElementById("username").innerHTML = "用户名长度为3-10位数字或字母！";
			      return false;
			 }else if(username=="" || username==null){
			     alert("忘记输入账号了!");

			     return false; 
			 }
			 if(password.length<3 || password.length>10){
			      alert("密码长度为3-10位数字或字母！");
			      return false;
			 }else if(password=="" || password==null){
			     alert("忘了输入密码了"); 
			     //document.getElementById("password").innerHTML = "请输入密码";
                 return false; 
				}
			 if(password1!=password){
				 alert("两次输入的密码不一致！请重新输入！");
				 return false;
			 }
			if(select=="" || select==null){
			     alert("请选择角色!");
                 //document.getElementById("role").innerHTML = "请输入角色";
                 return false;
			}else if(!select.match(pattern)){
				 return false;
			}
			if(address=="" || address==null){
			      alert("忘记输入地址了!");
			      return false;
			}
			if(!(/^1[34578]\d{9}$/.test(phone))){
				 alert("手机号码有误!请重填!")
				 return false;
			}
			alert("注册成功,将返回登录页面!");
	 return true;
}