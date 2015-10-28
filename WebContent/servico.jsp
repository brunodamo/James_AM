<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="cabecalho.jsp"%>


<section id="main-content">
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-files-o"></i> Serviço</h3>
				</div>
			</div>
              <!-- Form validations -->              
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              Registrar Consumo
                          </header>
                          <div class="panel-body">
                              <div class="form">
                                  <form class="form-validate form-horizontal" id="feedback_form" method="post" action="midlet">
                                      <div class="form-group ">
                                          <label for="cd_hosp" class="control-label col-lg-2">Código da Hosp. <span class="required">*</span></label>
                                          <div class="col-lg-2">
                                              <input class="form-control" id="cd_hosp" name="codigo" maxlength="8" readonly="readonly" value="${hospedagem.codigoHospedagem}" />
                                          </div>
                                          <label for="cd_hosp" class="control-label col-lg-2">Nome do Hosp. <span class="required">*</span></label>
                                          <div class="col-lg-5">
                                              <input class="form-control" id="cd_hosp" name="codigo" readonly="readonly" value="${hospedagem.cliente.nomePessoa}" />
                                          </div>
                                      </div>
                                          <label for="data" class="control-label col-lg-2">Data Solicitação <span class="required">*</span></label>
                                          <div class="col-lg-2">
                                              <input class="form-control" id="data" name="data" maxlength="10" type="text" required />
                                          </div>  
                                        <label for="produto_servico" class="control-label col-lg-2">Serviços <span class="required">*</span></label>
                                        <div class="col-lg-5">
	                                         <select class="form-control m-bot15" id="produto_servico">
	                                             <c:forEach var="n" items="${servicos}">
	                                             		<option valor="${n.preco}">${n.produtoServico.descricaoServico} - <fmt:formatNumber value="${n.preco}" type="currency" /></option>
	                                             </c:forEach>
	                                         </select>
	                                     </div>
                                      <label for="qtd" class="control-label col-lg-2">Quantidade <span class="required">*</span></label>
	                                      <div class="col-lg-2">
	                                          <select class="form-control m-bot15" id="qtd" name="quant">
	                                              <c:forEach var="i" begin="1" end="20">
		                                              <option><c:out value="${i}"/></option>
	                                              </c:forEach>
	                                          </select>
	                                      </div>
                                      <div class="form-group ">
                                          <label for="valor_total" class="control-label col-lg-2">Valor Total </label>
                                          <div class="col-lg-5" style="margin-top: 8px;">
											<input class="form-control" id="valor_total" name="valor_total"  readonly="readonly" />                                          </div>
                                      </div>                                         
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" type="submit">Registrar</button>
                                              <button class="btn btn-default" type="reset" name="cancela" id="cancela" >Cancelar</button>
                                          </div>
                                      </div>
                                  </form>
                              </div>

                          </div>
                      </section>
                  </div>
              </div>
              <!-- page end-->
          </section>
      </section>
      <!--main content end-->
      
      
<%@ include file="rodape.jsp"%>