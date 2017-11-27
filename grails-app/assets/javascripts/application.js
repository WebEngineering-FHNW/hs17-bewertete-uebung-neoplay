// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require jquery-3.2.1.min
//= require popper-1.12.3.min
//= require bootstrap-4.0.0-beta2.min
//= require_self

$().ready(function () {

    // Popper Tooltips
    $('[data-toggle="tooltip"]').tooltip();

    // Load More
    var loadMore = $('[data-action="load-more"]');
    if(loadMore.length) {
        var page = 1;
        $('body').on('click', '[data-action="load-more"]', function(e) {
            $('[data-action="load-more"]').hide();
            $('.spinner').show();
            page++;
            $.ajax({
                method: 'GET',
                url: "/recipe/index?page="+page,
                cache: false,
                success: function(data) {
                    // simulate delay ;-)
                    setTimeout(function(){
                        $('.spinner').hide();
                        if(data.trim().length) {
                            $('#recipeContainer').append(data);
                            $('[data-action="load-more"]').show();
                        }
                    }, 800);
                }
            });
        });
    }

    // Remove Ingredient
    $('body').on('click', '[data-action="remove"]', function(e) {
        e.preventDefault();
        var index = $(this).data('index');
        var row = $(this).closest('.form-row');
        var frm = $(row).closest('form');
        row.remove();
        frm.append('<input type="hidden" name="ingredients['+index+'].deleted" value="true">');
    });

    // Add Ingredient
    $('body').on('click', '[data-action="add"]', function(e) {
        e.preventDefault();
        var count = $(this).data('count');
        var container = $('#newIngredients');
        container.append('<div class="form-row">\n' +
            '                <div class="form-group col-3">\n' +
            '                    <input type="text" name="ingredients['+count+'].quantity" class="form-control" value="">\n' +
            '                </div>\n' +
            '                <div class="form-group col-3">\n' +
            '                    <select class="form-control" name="ingredients['+count+'].unit">\n' +
            '                        <optgroup label="Gramm">\n' +
            '                            <option value="g">g</option>\n' +
            '                            <option value="kg">kg</option>\n' +
            '                        </optgroup>\n' +
            '                        <optgroup label="Löffel">\n' +
            '                            <option value="EL">EL</option>\n' +
            '                            <option value="TL">TL</option>\n' +
            '                            <option value="Prise">Prise</option>\n' +
            '                        </optgroup>\n' +
            '                        <optgroup label="Liter">\n' +
            '                            <option value="ml">ml</option>\n' +
            '                            <option value="cl">cl</option>\n' +
            '                            <option value="dl">dl</option>\n' +
            '                            <option value="l">l</option>\n' +
            '                        </optgroup>\n' +
            '                        <optgroup label="Andere">\n' +
            '                            <option value="Stk">Stk</option>\n' +
            '                            <option value="Pk">Pk</option>\n' +
            '                            <option value="Bund">Bund</option>\n' +
            '                        </optgroup>\n' +
            '                    </select>\n' +
            '                </div>\n' +
            '                <div class="form-group col-6">\n' +
            '                    <div class="input-group">\n' +
            '                        <input type="text" class="form-control" name="ingredients['+count+'].name" value="">\n' +
            '                        <span class="input-group-btn">\n' +
            '                            <button class="btn btn-default" type="button" data-action="remove" data-index="'+count+'"><i class="fa fa-trash" title="" data-toggle="tooltip" data-original-title="Entfernen"></i></button>\n' +
            '                        </span>\n' +
            '                    </div>\n' +
            '                </div>\n' +
            '            </div>');
        $(this).data('count',count+1);
    });

});