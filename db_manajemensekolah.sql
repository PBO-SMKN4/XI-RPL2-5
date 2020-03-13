-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Mar 2020 pada 15.09
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_manajemensekolah`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_guru`
--

CREATE TABLE `t_guru` (
  `nip` varchar(20) NOT NULL,
  `nama_lengkap` varchar(100) NOT NULL,
  `matpel` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_matpel`
--

CREATE TABLE `t_matpel` (
  `kd_matpel` varchar(15) NOT NULL,
  `nama_matpel` varchar(100) NOT NULL,
  `kelompok` varchar(10) NOT NULL,
  `tingkat` varchar(10) NOT NULL,
  `nip` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_rekapnilai`
--

CREATE TABLE `t_rekapnilai` (
  `kd_nilai` int(11) NOT NULL,
  `nis` varchar(15) NOT NULL,
  `kd_matpel` varchar(15) NOT NULL,
  `tugas1` int(3) NOT NULL,
  `tugas2` int(3) NOT NULL,
  `tugas3` int(3) NOT NULL,
  `tugas4` int(3) NOT NULL,
  `tugas5` int(3) NOT NULL,
  `semester` int(1) NOT NULL,
  `tahun_ajaran` varchar(10) NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_siswa`
--

CREATE TABLE `t_siswa` (
  `nis` varchar(20) NOT NULL,
  `nama_lengkap` varchar(100) NOT NULL,
  `kelas` varchar(20) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `t_guru`
--
ALTER TABLE `t_guru`
  ADD PRIMARY KEY (`nip`);

--
-- Indeks untuk tabel `t_matpel`
--
ALTER TABLE `t_matpel`
  ADD PRIMARY KEY (`kd_matpel`),
  ADD KEY `nip` (`nip`);

--
-- Indeks untuk tabel `t_rekapnilai`
--
ALTER TABLE `t_rekapnilai`
  ADD PRIMARY KEY (`kd_nilai`),
  ADD KEY `nis` (`nis`),
  ADD KEY `kd_matpel` (`kd_matpel`);

--
-- Indeks untuk tabel `t_siswa`
--
ALTER TABLE `t_siswa`
  ADD PRIMARY KEY (`nis`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `t_rekapnilai`
--
ALTER TABLE `t_rekapnilai`
  MODIFY `kd_nilai` int(11) NOT NULL AUTO_INCREMENT;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `t_matpel`
--
ALTER TABLE `t_matpel`
  ADD CONSTRAINT `t_matpel_ibfk_1` FOREIGN KEY (`nip`) REFERENCES `t_guru` (`nip`);

--
-- Ketidakleluasaan untuk tabel `t_rekapnilai`
--
ALTER TABLE `t_rekapnilai`
  ADD CONSTRAINT `t_rekapnilai_ibfk_1` FOREIGN KEY (`nis`) REFERENCES `t_siswa` (`nis`),
  ADD CONSTRAINT `t_rekapnilai_ibfk_2` FOREIGN KEY (`kd_matpel`) REFERENCES `t_matpel` (`kd_matpel`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
