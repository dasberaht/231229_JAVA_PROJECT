// 스크롤 이벤트를 감지하여 헤더의 클래스를 변경하는 JavaScript 코드
window.addEventListener('scroll', function () {
    const header = document.querySelector('.header');
    if (window.scrollY > 50) {
        header.classList.add('shrink', 'fixed');
    } else {
        header.classList.remove('shrink', 'fixed');
    }
});