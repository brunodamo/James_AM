
$(window).load(function(){
	$("#data").mask("99/99/9999");
	
	$('#qtd').change(function(){
		valor_total();
	});
	$('#produto_servico').change(function(){
		valor_total();
	});
	$('#produto_servico').ready(function(){
		valor_total();
	});
	
	$('#cancela').click(function(){
		perguntar();	
	});
	
});

function valor_total (){
	var quantidade = $('select[name="quant"]').val();
	var valor = $("#produto_servico option:selected").attr("valor");

	var total = quantidade * valor;

	var formatado = numeral(total).format('$0,0.00');

	$('#valor_total').val('R'+ formatado);
}


function perguntar(){
    var n = noty({
        text: 'Realmente deseja cancelar?',
        type: 'confirm',
        dismissQueue: false,
        layout: 'center',
        theme: 'defaultTheme',
 buttons: [
    {addClass: 'btn btn-primary', text: 'Ok', onClick: function($noty) {
    	window.location.replace("http://localhost:8080/James_AM/index.jsp");
        $noty.close();
      }
    },
    {addClass: 'btn btn-danger', text: 'Cancelar', onClick: function($noty) {
        $noty.close();
      }
    }
  ]


    })
}
