document.addEventListener('DOMContentLoaded', function() {
    var elems = document.querySelectorAll('.sidenav');
    var instances = M.Sidenav.init(elems, 'edge');

    var elems2 = document.querySelectorAll('.collapsible');
    var instances = M.Collapsible.init(elems2, "accordion");

    let unsigned = document.getElementById("unsigned");
    unsigned.addEventListener("change", function(){
        console.log(unsigned.checked);
    });

    var collationSelectEl = document.querySelectorAll('select');
    var instances = M.FormSelect.init(collationSelectEl, "");
    
  });
