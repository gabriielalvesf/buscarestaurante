// USER PANEL
$(document).ready(function(){
  $("#user-panel").hover(function(){
    $("#user-info").addClass("show");
    },function(){
    $("#user-info").removeClass("show");
  });
  
  
  $('#user-btn').click(function() {
        $("#modal-user").addClass("show");
    });
    
    $('#close-modal').click(function() {
        $("#modal-user").removeClass("show");
    });

    $('#example').dataTable();
    
    jQuery(function($){
        $(".data").mask("99/99/9999");
        $(".cnpj").mask("999.999.999/9999-99");
        $(".telefone").mask("(99) 9999-9999");
        $(".cpf").mask("999.999.999-99");
        $(".cep").mask("99999-999");
     });
});

