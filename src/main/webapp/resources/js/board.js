$(document).ready( (e) => {
	$.ajax({
		type :"post",
		url : "boardList.do",
		data : {
			
		},
		dataType : "json",
		success : function(data){
			
			let table ="";
			
			for(let i=0;i<data.length;i++){
			// thyemleaf : html에서 쓰는 jstl
				table += `
				<tr><td>${data[i].idx}</td>
				<td><a href="javascript:open(${data[i].idx},${data[i].count})">${data[i].title}</a></td>
				<td>`+data[i].writer+`</td>
				<td>`+data[i].indate+`</td>
				<td>`+data[i].count+`</td></tr>
				<tr id="board${data[i].idx}" style="display:none">
				<td colspan = 5>
				<textarea row="5" class="form-control">${data[i].content}</textarea>
				</td>
				</tr>
				`
				
			}
			$('#tbody').html(table);
			
			
		},
		error : function(e){
			alert('error')
		}
	})
})
//====================================================================================

function open(idx, count){

	if($('#board'+idx).css('display') =='none'){
		
		$('#board'+idx).css('display','table-row');
		
		$.ajax({
			type :"get",
			url : "viewUpdate.do",
			data : {
				"idx":idx,
				"count":count
			},
			dataType : "text",
			success : function(data){
			},
			error : function(e){
				alert('view error')
			}
		})

	}else{
		$('#board'+idx).css('display','none')
	}

}