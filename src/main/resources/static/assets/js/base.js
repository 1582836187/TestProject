window.onload = function () {
    // ios10+ 禁止缩放
    // 阻止双击放大
    var lastTouchEnd = 0;
    document.addEventListener('touchstart', function (event) {
        if (event.touches.length > 1) {
            event.preventDefault();
        }
    });
    document.addEventListener('touchend', function (event) {
        var now = (new Date()).getTime();
        if (now - lastTouchEnd <= 300) {
            event.preventDefault();
        }
        lastTouchEnd = now;
    }, false);
    // 阻止双指放大
    document.addEventListener('gesturestart', function (event) {
        event.preventDefault();
    });

    //ios长按禁止a标题路径显示
    document.documentElement.style.webkitTouchCallout = 'none';

    // 页面加载完成后显示
    $('body').addClass('loading-success');

    // 横屏模式
    var updateOrientation = function (deg) {
        var deg = deg || window.orientation;
        if (deg === 0 || deg === -180) {
            $('body').attr('data-orientation', '0deg');
        } else if (deg === 90 || deg === -90) {
            $('body').attr('data-orientation', '90deg');
        }
    }
    updateOrientation();
    $(window).bind('orientationchange', function (e) {
        var deg = window.orientation || 0;
        updateOrientation(deg);
    })
}