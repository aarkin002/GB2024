<!-- 1. Реализовать основные 4 арифметические операции в виде функции с тремя параметрами – два параметра это числа, третий – операция. Обязательно использовать оператор return.  -->

<?php
function add(int $arg1, int $arg2) : int {
    return $arg1 + $arg2;
}

function div(int $arg1, int $arg2) : int {
    return $arg1 / $arg2;
}

function mltplction(int $arg1, int $arg2) : int {
    return $arg1 * $arg2;
}

function subtr(int $arg1, int $arg2) : int {
    return $arg1 - $arg2;
}

echo "1 задание результат: ", "\n";
echo add(1, 2),"\n";
echo div(2, 2),"\n";
echo mltplction(3, 2),"\n";
echo subtr(4, 2),"\n";

?>

<!-- 2. Реализовать функцию с тремя параметрами: function mathOperation($arg1, $arg2, $operation), где $arg1, $arg2 – значения аргументов, $operation – строка с названием операции. В зависимости от переданного значения операции выполнить одну из арифметических операций (использовать функции из пункта 3) и вернуть полученное значение (использовать switch). -->

<?php
function mathOperation(int $arg1, int $arg2, $symb) : int {
    $value = null;
    switch ($symb) {
        case "+" :
            $value = $arg1 +  $arg2;
            break;
        case "-" :
            $value = $arg1 -  $arg2;
            break;
        case "*" :
            $value = $arg1 *  $arg2;
            break;
        case "/" :
            $value = $arg1 /  $arg2;
            break;
    }

    return  $value;
}

echo "2 задание результат: " , mathOperation(4, 2, "*"), "\n";
?>

<!-- 3. Объявить массив, в котором в качестве ключей будут использоваться названия областей, а в качестве значений – массивы с названиями городов из соответствующей области. Вывести в цикле значения массива, чтобы результат был таким: Московская область: Москва, Зеленоград, Клин Ленинградская область: Санкт-Петербург, Всеволожск, Павловск, Кронштадт Рязанская область … (названия городов можно найти на maps.yandex.ru). -->



<?php
$nameOfRegion = array (
    "moscowRegion" => ["Moscow", "Zelenogorsk", "Klin"],
    "leningradskiyRegion" => ["Piter", "Vsevologsk", "Pavlovsk"],
    "kalugskiyRegion" => ["Kaluga", "Balabanovo"]
);

echo "3 задание результат: ", "\n";

foreach ($nameOfRegion as $key => $value) {
    echo $key, " : ", implode(", ", $value),"\n";
}
?>


<!-- 4. Объявить массив, индексами которого являются буквы русского языка, а значениями – соответствующие латинские буквосочетания (‘а’=> ’a’, ‘б’ => ‘b’, ‘в’ => ‘v’, ‘г’ => ‘g’, …, ‘э’ => ‘e’, ‘ю’ => ‘yu’, ‘я’ => ‘ya’). Написать функцию транслитерации строк. -->

<?php
function transliterate($str): mixed
{
$arr = array(
"А"=>"A","Б"=>"B","В"=>"V","Г"=>"G",
"Д"=>"D","Е"=>"E","Ж"=>"J","З"=>"Z","И"=>"I",
"Й"=>"Y","К"=>"K","Л"=>"L","М"=>"M","Н"=>"N",
"О"=>"O","П"=>"P","Р"=>"R","С"=>"S","Т"=>"T",
"У"=>"U","Ф"=>"F","Х"=>"H","Ц"=>"TS","Ч"=>"CH",
"Ш"=>"SH","Щ"=>"SCH","Ъ"=>"","Ы"=>"YI","Ь"=>"",
"Э"=>"E","Ю"=>"YU","Я"=>"YA","а"=>"a","б"=>"b",
"в"=>"v","г"=>"g","д"=>"d","е"=>"e","ж"=>"j",
"з"=>"z","и"=>"i","й"=>"y","к"=>"k","л"=>"l",
"м"=>"m","н"=>"n","о"=>"o","п"=>"p","р"=>"r",
"с"=>"s","т"=>"t","у"=>"u","ф"=>"f","х"=>"h",
"ц"=>"ts","ч"=>"ch","ш"=>"sh","щ"=>"sch","ъ"=>"y",
"ы"=>"yi","ь"=>"","э"=>"e","ю"=>"yu","я"=>"ya",
" "=> "_", "/"=> "_");
if (preg_match('/[^A-Za-z0-9_\-]/', $str)) {
$str = strtr($str,$arr);
$str = preg_replace('/[^A-Za-z0-9_\-.]/', '', $str);
}
return $str;
}

echo "4 задание результат: ", "\n";
$str="Привет";
echo transliterate($str);
?>

