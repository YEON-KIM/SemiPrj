function button_delete(){
  confirm("상품을 삭제하시겠습니까?");
}

$(document).ready(function() {
  // Check all checkboxes when check-all checkbox is clicked
  $('#check-all').click(function() {
    $('.check-item').prop('checked', this.checked);
  });

  // Uncheck check-all checkbox if any checkbox is unchecked
  $('.check-item').click(function() {
    if (!$(this).prop('checked')) {
      $('#check-all').prop('checked', false);
    }
  });

  // Check check-all checkbox if all checkboxes are checked
  $('.check-item').change(function() {
    var allChecked = $('.check-item:checked').length === $('.check-item').length;
    $('#check-all').prop('checked', allChecked);
  });
});
