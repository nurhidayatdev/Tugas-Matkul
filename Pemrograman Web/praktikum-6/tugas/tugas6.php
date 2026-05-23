<?php
echo "<h2>TUGAS: Menyelesaikan Tes Deret</h2>";
echo "<p>Kode ini menghitung angka selanjutnya dalam setiap deret.</p>";

echo "<h3>a. 4, 6, 9, 13, 18, ??</h3>";
$deretA = [4, 6, 9, 13, 18];
$angkaTerakhirA = end($deretA);
$penambahan = 6; 
$hasilA = $angkaTerakhirA + $penambahan;
echo "Pola: Penambahan bertingkat (+2, +3, +4, +5, +6)<br>";
echo "Angka selanjutnya adalah: " . $angkaTerakhirA . " + " . $penambahan . " = " . $hasilA . "<br>";
echo "Deret lengkap: " . implode(", ", $deretA) . ", " . $hasilA . "";

echo "<hr>";

echo "<h3>b. 2, 2, 3, 3, 4, ??</h3>";
$deretB = [2, 2, 3, 3, 4];
$angkaTerakhirB = end($deretB);
$hasilB = $angkaTerakhirB;
echo "Pola: Setiap angka diulang dua kali (2, 2, 3, 3, 4, 4)<br>";
echo "Angka selanjutnya adalah: " . $hasilB . "<br>";
echo "Deret lengkap: " . implode(", ", $deretB) . ", " . $hasilB . "";

echo "<hr>";

echo "<h3>c. 1, 9, 2, 10, 3, ??</h3>";
$deretC = [1, 9, 2, 10, 3];
$angkaGenapSebelumnya = $deretC[3]; 
$hasilC = $angkaGenapSebelumnya + 1;
echo "Pola: Dua sub-deret berjalan bergantian:<br>";
echo "  - Posisi Ganjil: 1, 2, 3, ... (+1)<br>";
echo "  - Posisi Genap: 9, 10, 11, ... (+1)<br>";
echo "Angka selanjutnya adalah: " . $angkaGenapSebelumnya . " + 1 = " . $hasilC . "<br>";
echo "Deret lengkap: " . implode(", ", $deretC) . ", " . $hasilC . "";

echo "<hr>";

?>