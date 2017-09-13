function test(){
			var username=document.form1.username.value;
			var password=document.form1.password.value;
			var select=document.getElementById("select");
			  alert(username);
			  alert("用户名不能为空");
			if(username=="" || username==null){
			     alert("用户名不能为空");
			     document.getElementById("username").focus();
			     document.getElementById("username").select();
			     
			     return false; 
				}
			if(password=="" || password==null){
			     alert("密码不能为空"); 
			    document.getElementById("password").focus();
			     document.getElementById("password").select();
                 return false; 
				}
			if(select=="" || select==null){
			     alert("角色不能为空");
                 document.getElementById("select").focus();
			     document.getElementById("select").select();
                 return false;
				}
			
		}