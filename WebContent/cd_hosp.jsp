<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="cabecalho.jsp"%>


<section id="main-content">
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-files-o"></i> ${titulo}</h3>
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
                                          <label for="cname" class="control-label col-lg-2">Código da Hosp. <span class="required">*</span></label>
                                          <div class="col-lg-2">
                                              <input class="form-control" id="cname" name="codHosp" maxlength="8" type="text" required />
                                          </div>
                                          <input type="hidden" name="modulo" value="hosp"/>
                                          <input type="hidden" name="redirecionar" value="${redirect}"/>
                                      <div class="form-group">
                                          <div class="col-lg-offset col-lg-2">
                                              <button class="btn btn-primary" name="valida" id="valida" type="submit">Consultar</button>
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