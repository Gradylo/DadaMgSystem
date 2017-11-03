/**
 * Created by jian on 2017/10/26.
 */
var BaseFormValidation = function () {
    var initValidationMaterial = function () {
        $('.js-form-validate').validate({
            errorClass: 'help-block text-right animated fadeInDown',
            errorElement: 'div',
            errorPlacement: function (error, e) {
                $(e).parents('.form-group').append(error);
            },
            highlight: function (e) {
                $(e).closest('.form-group').removeClass('has-error').addClass('has-error');
                $(e).closest('.help-block').remove();
            },
            success: function (e) {
                $(e).closest('.form-group').removeClass('has-error');
                $(e).closest('.help-block').remove();
            },
            rules: {
                'uname': {
                    required: true,
                    minlength: 6,
                    maxlength: 20
                },
                'password': {
                    required: true,
                    minlength: 6,
                    maxlength: 20
                }
            },
            messages: {
                'uname':{
                    required: '账号不能为空',
                    minlength: '账号不能小于6个字符',
                    maxlength: '账号不能大于20个字符'
                } ,
                'password': {
                    required: '密码不能为空',
                    minlength: '密码不能小于6个字符',
                    maxlength: '密码不能大于20个字符'
                }
            }
        });
    };

    return {
        init: function () {
            initValidationMaterial();
        }
    };
}();

$(function () {
    BaseFormValidation.init();
});

