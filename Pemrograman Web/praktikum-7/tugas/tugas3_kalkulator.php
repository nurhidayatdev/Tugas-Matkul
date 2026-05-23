<?php
function tambah($a, $b) {
    return $a + $b;
}

function kurang($a, $b) {
    return $a - $b;
}

function kali($a, $b) {
    return $a * $b;
}

function bagi($a, $b) {
    if ($b != 0) {
        return $a / $b;
    } else {
        return "Tidak dapat dibagi oleh 0";
    }
}

$hasil_perhitungan = "Belum ada perhitungan.";

if (isset($_POST['bilangan1']) && isset($_POST['bilangan2'])) {
    $b1 = (float)$_POST['bilangan1'];
    $b2 = (float)$_POST['bilangan2'];
    $operasi_dilakukan = "";
    $simbol = "";

    if (isset($_POST['hitung_tambah'])) {
        $hasil = tambah($b1, $b2);
        $operasi_dilakukan = "Penjumlahan";
        $simbol = "+";
    } elseif (isset($_POST['hitung_kurang'])) {
        $hasil = kurang($b1, $b2);
        $operasi_dilakukan = "Pengurangan";
        $simbol = "-";
    } elseif (isset($_POST['hitung_kali'])) {
        $hasil = kali($b1, $b2);
        $operasi_dilakukan = "Perkalian";
        $simbol = "×";
    } elseif (isset($_POST['hitung_bagi'])) {
        $hasil = bagi($b1, $b2);
        $operasi_dilakukan = "Pembagian";
        $simbol = "÷";
    }

    if (!empty($operasi_dilakukan)) {
        $hasil_perhitungan = "$operasi_dilakukan: $b1 $simbol $b2 = <b>$hasil</b>";
    }
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Tugas 3: Kalkulator dengan Fungsi</title>
</head>
<body>
    <h2>Kalkulator Sederhana</h2>

    <form method="POST" action="">
        Bilangan 1: <input type="number" step="any" name="bilangan1" required value="<?php echo $_POST['bilangan1'] ?? ''; ?>"><br><br>
        Bilangan 2: <input type="number" step="any" name="bilangan2" required value="<?php echo $_POST['bilangan2'] ?? ''; ?>"><br><br>

        <input type="submit" name="hitung_tambah" value="Penjumlahan">
        <input type="submit" name="hitung_kurang" value="Pengurangan">
        <input type="submit" name="hitung_kali" value="Perkalian">
        <input type="submit" name="hitung_bagi" value="Pembagian">
    </form>
    
    <br><br>
    
    <h3>Hasil perhitungan:</h3>
    <?php echo $hasil_perhitungan; ?>

</body>
</html>
