-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2020 at 05:03 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

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
-- Table structure for table `t_guru`
--

CREATE TABLE `t_guru` (
  `nip` varchar(20) NOT NULL,
  `nama_lengkap` varchar(100) NOT NULL,
  `matpel` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_guru`
--

INSERT INTO `t_guru` (`nip`, `nama_lengkap`, `matpel`, `password`) VALUES
('1234001', 'Bambang Yudhiono', 'Pendidikan Kewarganegaraan', '1234001'),
('1234002', 'Laras Trisnawati', 'Bahasa Indonesia', '1234002');

-- --------------------------------------------------------

--
-- Table structure for table `t_materi`
--

CREATE TABLE `t_materi` (
  `kd_materi` int(11) NOT NULL,
  `nama_matpel` varchar(100) NOT NULL,
  `judul` varchar(255) NOT NULL,
  `catatan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_materi`
--

INSERT INTO `t_materi` (`kd_materi`, `nama_matpel`, `judul`, `catatan`) VALUES
(1, 'PKN', 'Tugas Akhir', 'Mencatat materi semester 2 di buku catatan, kalau sudah kirim ke wa ibu di 0895631993728 sertakan nama dan kelasnya');

-- --------------------------------------------------------

--
-- Table structure for table `t_matpel`
--

CREATE TABLE `t_matpel` (
  `kd_matpel` varchar(15) NOT NULL,
  `nama_matpel` varchar(100) NOT NULL,
  `kelompok` varchar(10) NOT NULL,
  `tahun_ajaran` varchar(10) NOT NULL,
  `nip` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_matpel`
--

INSERT INTO `t_matpel` (`kd_matpel`, `nama_matpel`, `kelompok`, `tahun_ajaran`, `nip`) VALUES
('indo11', 'Bahasa Indonesia', '', '', '1234002'),
('pkn11', 'Pendidikan Kewarganegaraan', '', '', '1234001');

-- --------------------------------------------------------

--
-- Table structure for table `t_rekapnilai`
--

CREATE TABLE `t_rekapnilai` (
  `kd_nilai` int(11) NOT NULL,
  `nis` varchar(15) NOT NULL,
  `kd_matpel` varchar(15) NOT NULL,
  `pengetahuan` int(3) NOT NULL,
  `keterampilan` int(3) NOT NULL,
  `sikap` varchar(255) NOT NULL,
  `t1` int(3) NOT NULL,
  `t2` int(3) NOT NULL,
  `t3` int(3) NOT NULL,
  `t4` int(3) NOT NULL,
  `t5` int(3) NOT NULL,
  `presentasi` int(3) NOT NULL,
  `takhir` int(3) NOT NULL,
  `pas` int(3) NOT NULL,
  `semester` int(1) NOT NULL,
  `tahun_ajaran` varchar(10) NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_rekapnilai`
--

INSERT INTO `t_rekapnilai` (`kd_nilai`, `nis`, `kd_matpel`, `pengetahuan`, `keterampilan`, `sikap`, `t1`, `t2`, `t3`, `t4`, `t5`, `presentasi`, `takhir`, `pas`, `semester`, `tahun_ajaran`, `keterangan`) VALUES
(1, '1819117636', 'indo11', 80, 90, '68', 0, 0, 0, 0, 0, 0, 0, 0, 1, '', ''),
(2, '1819117637', 'pkn11', 90, 67, '0', 0, 0, 0, 0, 0, 0, 0, 0, 1, '', '');

-- --------------------------------------------------------

--
-- Table structure for table `t_siswa`
--

CREATE TABLE `t_siswa` (
  `nis` varchar(20) NOT NULL,
  `nama_lengkap` varchar(100) NOT NULL,
  `kelas` varchar(20) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_siswa`
--

INSERT INTO `t_siswa` (`nis`, `nama_lengkap`, `kelas`, `jurusan`, `password`) VALUES
('1819117636', 'Sahlan Putra P', 'XI RPL 2', 'Rekayasa Perangkat Lunak', '1819117636'),
('1819117637', 'Satria Putra Ramadhan', 'XI RPL 2', 'Rekayasa Perangkat Lunak', '1819117637');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_guru`
--
ALTER TABLE `t_guru`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `t_materi`
--
ALTER TABLE `t_materi`
  ADD PRIMARY KEY (`kd_materi`);

--
-- Indexes for table `t_matpel`
--
ALTER TABLE `t_matpel`
  ADD PRIMARY KEY (`kd_matpel`),
  ADD KEY `nip` (`nip`);

--
-- Indexes for table `t_rekapnilai`
--
ALTER TABLE `t_rekapnilai`
  ADD PRIMARY KEY (`kd_nilai`),
  ADD KEY `nis` (`nis`),
  ADD KEY `kd_matpel` (`kd_matpel`);

--
-- Indexes for table `t_siswa`
--
ALTER TABLE `t_siswa`
  ADD PRIMARY KEY (`nis`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t_materi`
--
ALTER TABLE `t_materi`
  MODIFY `kd_materi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `t_rekapnilai`
--
ALTER TABLE `t_rekapnilai`
  MODIFY `kd_nilai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `t_matpel`
--
ALTER TABLE `t_matpel`
  ADD CONSTRAINT `t_matpel_ibfk_1` FOREIGN KEY (`nip`) REFERENCES `t_guru` (`nip`);

--
-- Constraints for table `t_rekapnilai`
--
ALTER TABLE `t_rekapnilai`
  ADD CONSTRAINT `t_rekapnilai_ibfk_1` FOREIGN KEY (`nis`) REFERENCES `t_siswa` (`nis`),
  ADD CONSTRAINT `t_rekapnilai_ibfk_2` FOREIGN KEY (`kd_matpel`) REFERENCES `t_matpel` (`kd_matpel`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
