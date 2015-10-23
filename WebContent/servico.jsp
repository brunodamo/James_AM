<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="cabecalho.jsp"%>


<section id="main-content">
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-files-o"></i> Serviço</h3>
					<b>${hospedagem.cliente.nomePessoa}</b>
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
                              	<form class="form-validate form-horizontal" id="feedback_form" method="get" action="midlet">
                                          <label for="data" class="control-label col-lg-2">Data Solicitação <span class="required">*</span></label>
                                          <div class="col-lg-2">
                                              <input class="form-control" id="data" name="subject" maxlength="10" type="text" required />
                                          </div>  
                                      </div>
                                        <label for="cemail" class="control-label col-lg-2">Serviços <span class="required">*</span></label>
                                        <div class="col-lg-5">
	                                         <select class="form-control m-bot15" id="cselect">
	                                             <option>Option 1</option>
	                                             <option>Option 2</option>
	                                             <option>Option 3</option>
	                                         </select>
	                                     </div>
                                      <label for="cselectqtd" class="control-label col-lg-2">Quantidade <span class="required">*</span></label>
	                                      <div class="col-lg-2">
	                                          <select class="form-control m-bot15" id="cselect">
	                                              <option>Option 1</option>
	                                              <option>Option 2</option>
	                                              <option>Option 3</option>
	                                          </select>
	                                      </div>
                                      <div class="form-group ">
                                          <label for="cname" class="control-label col-lg-2">Valor Total </label>
                                          <div class="col-lg-10">
                                              <span>R$ 500,00</span>
                                          </div>
                                      </div>                                         
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" type="submit">Registrar</button>
                                              <button class="btn btn-default" type="reset">Cancelar</button>
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