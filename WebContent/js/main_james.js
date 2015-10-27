
$(window).load(function(){
	$("#data").mask("99/99/9999");
	
	var qtd = $('#qtd');
	var ps = $('#produto_servico'); 
	
	if ((qtd.val($("#qtd:first").val())) && (ps.val($("#produto_servico:first")))){
		valor_inicial();
	}
	
	$('#qtd').change(function(){
		valor_total();
	});
	$('#produto_servico').change(function(){
		valor_total();
	});

});

function valor_inicial(){
	var valor = $("#produto_servico option:selected").attr("valor");
	var formatado = numeral(valor).format('$0,0.00');
	$('#valor_total').html('R'+formatado);
}

function valor_total (){
	var quantidade = $('select[name="quant"]').val();
	var valor = $("#produto_servico option:selected").attr("valor");

	var total = quantidade * valor;

	var formatado = numeral(total).format('$0,0.00');

	$('#valor_total').html('R'+formatado);
}
