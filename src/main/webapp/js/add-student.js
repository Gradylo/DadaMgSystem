/**
 * Created by jian on 2017/10/29.
 */
$(()=> {
    "use strict";
    let flag = true;
    var obj = {
        // 随机生成座位表
        randomStudentInfo() {
            const addStudentInfo = $("#js-seat-list");
            let str = '';
            // 生成随机数
            let random = Math.floor(Math.random() * 20 + 10);

            for (var i = 0; i < random; i++) {
                str += `<li><div class='student-item'></div><p class='student-name'>小明${i + 1}</p></li>`;
            }
            addStudentInfo.html(str);
        },
        // 编辑学员信息
        editSeatInfo() {
            let flag = true;
            let inputList = $("#js-student-detail input");
            $("#js-edit-seat-info").click(function () {
                inputList.addClass("edit");
                inputList.attr("disabled", false);
                if (flag) {
                    $(this).html("保存");
                } else {
                    $(this).html("编辑座位信息");
                    inputList.removeClass("edit");
                    inputList.attr("disabled", true);
                }
                flag = !flag;
            });
        },
        showClassRoom(leftWidth, rightWidth, leftNum, rightNum){
            var html1 = "",
                html2 = "";
            for (var i = 0; i < leftNum; i++) {
                html1 += ` <li><div class='student-item'></div><p class='student-name'>小明${i+1}</p></li>`;
            }
            $("#js-seat-left").width(leftWidth);
            $("#js-seat-left").html(html1);
            for (var i = 0; i < rightNum; i++) {
                html2 += ` <li><div class='student-item'></div><p class='student-name'>小明${i+1}</p></li>`;
            }
            $("#js-seat-right").width(rightWidth);
            $("#js-seat-right").html(html2);

            $("#js-seat-list li").addClass("animated fadeIn ");
        },
        changeClassRoom() {
            console.log("dd======");
            let clientWidth = $(window).width();
            console.log("dd");
            console.log(clientWidth);
            if (flag) {
                console.log("dd");
                if (clientWidth > 1200) {
                    this.showClassRoom(200, 300, 10, 15)
                } else if (clientWidth > 767 && clientWidth < 1199) {
                    this.showClassRoom(180, 270, 10, 15);
                } else if (clientWidth < 767) {
                    this.showClassRoom(120, 180, 10, 15);
                }
                flag = false;
            } else {
                console.log("aa");
                if (clientWidth > 1200) {
                    this.showClassRoom(300, 200, 15, 10)
                } else if (clientWidth > 767 && clientWidth < 1199) {
                    this.showClassRoom(270, 180, 15, 10);
                } else if (clientWidth < 767) {
                    this.showClassRoom(180, 120, 15, 10);
                }
                flag = true;
            }
        }

    };

    // obj.randomStudentInfo();
    obj.editSeatInfo();
    obj.changeClassRoom();
    $("#js-change-room").click(function () {
        obj.changeClassRoom();
    });
    window.onresize=function () {
        obj.changeClassRoom();
    };
});