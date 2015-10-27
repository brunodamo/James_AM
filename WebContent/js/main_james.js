
$(window).load(function(){
	$("#data").mask("99/99/9999");
	
	$('#qtd').change(function(){
		valor_total();
	});

	$('#produto_servico').change(function(){
		valor_total();
	});
	
});

function valor_total (){
	var quantidade = $('select[name="quant"]').val();
	var valor = $("#produto_servico option:selected").attr("valor");
	
	var total = quantidade * valor;
	
	var formatado = numeral(total).format('$0,0.00');
	
	$('#valor_total').html('R'+formatado);
}
