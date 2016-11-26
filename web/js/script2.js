$(document).ready(function() {
	$("#btnHorarios").on('click', function() {
		event.preventDefault();
		horarios();
	});
        $("#btnTarifas").on('click', function() {
		event.preventDefault();
		tarifas();
	});
        
        $("#btnChorario").on('click', function() {
		event.preventDefault();
		consultaHorario();
	});
        
        
        $("#fHorario").css("display", "none");
        $("#fCosto").css("display", "none");

	function horarios(){
            $("#fHorario").css("display", "block");
            $("#fCosto").css("display", "none");
		/*$.ajax({
			url: 'SERVOperaciones',
			type: 'POST',
			data: {param: "horario"},
				success:function(data){
				$("#result").html("<table border='1px' width='600px'>"+data+"</table>");
			},
			error:function(jq,es,error){
				console.log(es)
			}
		})*/
	}
        
        function tarifas(){
            $("#fCosto").css("display", "block");
            $("#fHorario").css("display", "none");
        }
        
        function consultaHorario(){
                    var campo = $("#txtHorario").val(); 
                    console.log(campo);
            $.ajax({
			url: 'SERVOperaciones',
			type: 'POST',
			data: {param: campo },
				success:function(data){
				$("#result").html("<table border='1px' width='600px'>"+data+"</table>");
			},
			error:function(jq,es,error){
				console.log(es)
			}
		});
        }
});

