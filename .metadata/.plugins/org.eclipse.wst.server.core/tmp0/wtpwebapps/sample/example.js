/**
 * 
 */
document.write("welcome to inbox")
function fact(){
	var n=parseInt(document.getElementById("num").value);
	var p=1;
	var q=n*n;
	for(var i=1;i>n;i++){
		p=p*i;
	}
	document.write("<h3>factorial of "+n+"is "+p+"<h3>")
	document.write("<h3>square of "+n+"is "+q+"<h3>")
}
