<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<title>mainTest</title>
</head>
<script>

	$(document).ready(function(){
		let url = "";
		
		$("#getMemberList").on("click", function(){
			url = "/getMemberList.do";
			let tableRecord ="";
			$.ajax({
				type:'POST',
				url:url,
				dataType:'json',
				success:function(data){
					if(data != "" || data != null){
						data.forEach((e, idx) => {
							tableRecord += "<tr>"
							tableRecord += "<td>"+e.id+"</td>"
							tableRecord += "<td>"+e.name+"</td>"
							tableRecord += "<td>"+e.age+"</td>"
							tableRecord += "<td>"+e.dept+"</td>"
							tableRecord += "</tr>"	
						})
						$("#memberList").empty();
						$("#memberList").append(tableRecord);
						tableRecord = "";
					}
				}
			})			
		});
		
	})
</script>
<body>
	<table>
		<thead>
			<tr>
				<th>id</th><th>이름</th><th>나이</th><th>부서</th>
			</tr>
		</thead>
		<tbody id="memberList">
		</tbody>
	</table>
	<button id="getMemberList">멤버목록</button>
	<button id="getCoronaInfo">info</button>
</body>
</html>