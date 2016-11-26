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
        
        $("#btnCosto").on('click', function() {
		event.preventDefault();
		consultaPorCosto();
	});
        
        $("#fHorario").css("display", "none");
        $("#fCosto").css("display", "none");

	function horarios(){
            $("#fHorario").css("display", "block");
            $("#fCosto").css("display", "none");
	}
        
        function tarifas(){
            $("#fCosto").css("display", "block");
            $("#fHorario").css("display", "none");
        }
        
        function consultaHorario(){
                    var campo = $("#txtHorario").val(); 
                    console.log(campo);
                    var operacion = "filtrarPorHorario";
            $.ajax({
			url: 'SERVOperaciones',
			type: 'POST',
			data: {param: campo, operacion:operacion},
				success:function(data){
				$("#result").html("<table border='1px' width='600px'>"+data+"</table>");
			},
			error:function(jq,es,error){
				console.log(es);
			}
		});
        }
        
        function consultaPorCosto(){
                    var costoInicial = $("#txtCinicial").val(); 
                    var costoFinal = $("#txtCfinal").val(); 
                    
                    var operacion = "filtrarPorCosto";
            $.ajax({
			url: 'SERVOperaciones',
			type: 'POST',
			data: {costoInicial: costoInicial, operacion:operacion, costoFinal:costoFinal},
				success:function(data){
				$("#result").html("<table border='1px' width='600px'>"+data+"</table>");
			},
			error:function(jq,es,error){
				console.log(es);
			}
		});
        }
});

