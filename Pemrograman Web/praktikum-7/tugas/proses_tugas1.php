<?php
if (isset($_POST['submit'])) {
    $input_string = $_POST['input_string'];

    $jumlah_karakter = strlen($input_string);

    echo "<h2>Hasil Perhitungan Karakter</h2>";
    echo "String yang Anda masukkan: <b>" . $input_string . "</b><br>";
    echo "Jumlah karakter dalam string tersebut adalah: <b>" . $jumlah_karakter . "</b>";
} else {
    echo "Akses tidak valid. Silakan kembali ke form input.";
}
?>