<?php
$kontak = [
    "nama"          => "Nur Hidayat",
    "email"         => "nurhidayat120706@gmail.com",
    "nomor_telepon" => "0878-7352-0868",
    "alamat"        => "Paccinongan Kabupaten Gowa"
];

echo "<h2>Tugas 2: Informasi Kontak (Array Asosiatif)</h2>";
echo "<h3>Detail Kontak:</h3>";
echo "<ul>";

foreach ($kontak as $kunci => $nilai) {
    $label = ucwords(str_replace('_', ' ', $kunci));
    echo "<li><b>" . $label . "</b>: " . $nilai . "</li>";
}
echo "</ul>";
?>