<?php
// Fungsi buatan sendiri untuk membuat combo box (dropdown) hari
function combahari($namahari)
{
    // Array hari
    $hari = array("Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu");

    // Mulai tag <select>
    echo "<select name=\"" . $namahari . "\">";

    // Loop untuk mengisi opsi
    for ($i = 0; $i <= 6; $i++) {
        echo "<option value=\"" . $hari[$i] . "\">" . $hari[$i] . "</option>";
    }

    // Tutup tag </select>
    echo "</select>";
}

echo "Hari lahir Anda: ";
// Memanggil fungsi
combahari("harilahir");
?>