<?php
// Mendapatkan tanggal dan waktu saat ini (format tahun, bulan, hari)
$tanggal_waktu = date("Y m d");

// Mendapatkan hari dalam bahasa Inggris
$hari = date("l");

// Array asosiatif untuk terjemahan hari
$hari_indonesia = [
    "Sunday"    => "Minggu",
    "Monday"    => "Senin",
    "Tuesday"   => "Selasa",
    "Wednesday" => "Rabu",
    "Thursday"  => "Kamis",
    "Friday"    => "Jumat",
    "Saturday"  => "Sabtu"
];

// Menerjemahkan hari
$hari_terjemahan = $hari_indonesia[$hari];

// Format tanggal dalam bahasa Indonesia (contoh: 23 Oktober 2025)
$tanggal = date("d F Y");

// Menampilkan Hasil
echo "Tanggal dan waktu saat ini: " . $tanggal_waktu . "<br>";
echo "Hari ini adalah: " . $hari_terjemahan . "<br>";
echo "Tanggal hari ini dalam format Indonesia: " . $tanggal;
?>