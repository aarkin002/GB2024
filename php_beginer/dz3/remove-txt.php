<?php

function replaceRemove($strSearch, $strReplace=null){
    $dir = "./file.txt";
    $contents = file_get_contents($dir);
    $strReplaceEnd = $strReplace . "\n";
    $contents = str_replace(findBirthday($strSearch), $strReplaceEnd, $contents);
    file_put_contents($dir, $contents);
}


function findBirthday($birthday) {
    foreach (file('./file.txt') as $line) {
        if (strpos($line, $birthday)){
            return "$line";
        }
    }
}

replaceRemove("06-06-1989", "Ольгий Иванов, 07-09-2000");