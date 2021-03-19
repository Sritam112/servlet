function validate(frm){
	let name=frm.pname.value;
	let age=frm.page.value;
	let add=frm.addr.value;
	let flag=true;
	if (name=="") {
		flag=false;
		document.getElemetById("pnameErr").innerHTML="person name is required";
		frm.pname.focus();
	}
	else if (name.length<10) {
		flag =false;
	document.getElementById("pnameErr").innerHTML="name must be btn 1 t0 9";
	frm.pname.focus();
	}
	if (age=="") {
		flag=false;
		document.getElementById("pageErr").innerHTML="parson age is required";
		frm.page.focus();
	}
	 if (age<0||age>110) {
		flag =false;
		document.getElementById("pageErr").innerHTML="age must be btn 1 t0 110";
		frm.page.focus();
	}
	else if (isNaN(age)) {
		flag =false;
	document.getElementById("pageErr").innerHTML="age must be btn 1 t0 9";
	frm.pname.focus();
	}
	if (add=="") {
		flag=false;
	document.getElementById("paddrsErr").innerHTML="addres should  requierd";
		frm.addr.focus();
	}
	
	return flag;
}