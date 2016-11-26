$(document).ready(function() {
	$("#btnHorarios").on('click', function() {
		event.preventDefault();
		horarios();
	});

	function horarios(){
		$.ajax({
			url: 'operaciones',
			type: 'POST',
			data: {param: 'horario'},
				success:function(data){
				$("#result").html(data);
			},
			error:function(jq,es,error){
				console.log(es)
			}
		})
	}

});

