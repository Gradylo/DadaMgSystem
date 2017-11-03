/**
 * Created by Administrator on 2017/11/1.
 */
$("#js-add-staff").click(function () {
    console.log("d");
    BootstrapDialog.show({
        message: function (dialog) {
            var $message = $('<div></div>');
            var pageToLoad = dialog.getData('pageToLoad');
            $message.load(pageToLoad);

            return $message;
        },
        data: {
            'pageToLoad': 'add-staff.html'
        },
        buttons: [
            {label: "确定",cssClass:"btn-primary"}, {label: "取消",cssClass:"btn-primary"}
        ]
    });
});