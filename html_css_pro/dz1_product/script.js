const menuActive = document.querySelector('.menu-active'); //находим меню
const burger = document.querySelector('.user-list__item-menu');  //Находим бургер
const menuClose = document.querySelector('.menu-close'); // Находим крестик

function toggleMenu() {
    menuActive.classList.toggle('hidden');  //Функция удаляет или устанавливает класс hidden диву с классом .menu-active
}

burger.addEventListener('click', toggleMenu);  //По клику срабатывает функция бургер
menuClose.addEventListener('click', toggleMenu); //По клику срабатывает функция Крестик