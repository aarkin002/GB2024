<?php

function findBirthday($birthday) {
    $fileContents = file_get_contents('./file.txt');

    foreach (file('./file.txt') as $line) {
        if (strpos($line, $birthday)){
            return "$line";
        }
    }
}

echo findBirthday(("06-06-1989"));