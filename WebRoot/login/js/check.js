function test(){
			var username=document.form1.username.value;
			var password=document.form1.password.value;
			var select=document.getElementById("select");
			  alert(username);
			  alert("�û�������Ϊ��");
			if(username=="" || username==null){
			     alert("�û�������Ϊ��");
			     document.getElementById("username").focus();
			     document.getElementById("username").select();
			     
			     return false; 
				}
			if(password=="" || password==null){
			     alert("���벻��Ϊ��"); 
			    document.getElementById("password").focus();
			     document.getElementById("password").select();
                 return false; 
				}
			if(select=="" || select==null){
			     alert("��ɫ����Ϊ��");
                 document.getElementById("select").focus();
			     document.getElementById("select").select();
                 return false;
				}
			
		}