package com.dicoding.kampusindonesia;

import java.util.ArrayList;

public class KampusData {
    private static String[] namaKampus={
            "Universitas Indonesia",
            "Universitas Gajah Mada",
            "Universitas Airlangga",
            "Institut Teknologi Sepuluh Nopember",
            "Universitas Brawijaya",
            "Universitas Negeri Surabaya",
            "Universitas Pendidikan Indonesia",
            "Institut Teknologi Bandung",
            "Institut Pertanian Bogor",
            "Politeknik Elektronika Negeri Surabaya"
    };

    private static String[] detailKampus={
            "UI bisa dibilang sebagai universitas pertama yang ada di Indonesia karena sudah berdiri sejak era kolonial Belanda pada tahun 1849. Namun, meski sudah ada sejak tahun 1849, nama UI baru diresmikan pada tahun 1950. Sejarah panjangnya ini membuat UI terus berkembang sebagai sebuah universitas yang modern, terbuka, humanis, dan komprehensif.",
            "Berdiri dengan nama “Universitas Negeri Gadjah Mada”, perguruan tinggi ini merupakan gabungan dari beberapa sekolah tinggi yang telah lebih dulu didirikan, di antaranya Balai Perguruan Tinggi Gadjah Mada, Sekolah Tinggi Teknik, dan Akademi Ilmu Politik yang terletak di Yogyakarta, Balai Pendidikan Ahli Hukum di Solo, serta Perguruan Tinggi Kedokteran Bagian Praklinis di Klaten, yang disahkan dengan Peraturan Pemerintah No. 23 Tahun 1949 tentang Peraturan Penggabungan Perguruan Tinggi menjadi Universiteit.",
            "Sejarah Universitas Airlangga berawal dari cikal-bakal lembaga pendidikan Nederlands Indische Artsen School (NIAS) dan School Tot Opleiding van Indische Tandartsen (STOVIT), masing-masing didirikan oleh pemerintah Hindia Belanda pada tahun 1913 dan 1928. Setelah masa pergolakan kemerdekaan sempat terganggu kelancarannya, pada tahun 1948 pemerintah pendudukan Belanda mendirikan Tandheelkunding Instituut yang merupakan cabang Universiteit van Indonesie Jakarta dan membuka kembali NIAS dengan nama Faculteit der Geneeskunde yang juga sebagai cabang Universiteit van Indonesie Jakarta.",
            "Dilansir dari situs berita Tempo, saat meresmikan berdirinya ITS, Presiden Soekarno menyebutnya sebagai Perguruan Tinggi Teknik 10 Nopember. ITS saat itu diusahakan oleh Yayasan Perguruan Tinggi Teknik 10 Nopember. Setelah beberapa tahun, Yayasan Perguruan Tinggi Teknik (YPPT), Perguruan Tinggi Teknik 10 Nopember diubah statusnya menjadi Perguruan Tinggi Negeri dengan nama Institut Teknologi Sepuluh Nopember (ITS).",
            "Universitas Brawijaya berkedudukan di Kota Malang, Jawa Timur, didirikan pada tanggal 5 Januari 1963 dengan Surat Keputusan Menteri Perguruan Tinggi dan Ilmu Pengetahuan (PTIP) Nomor 1 Tahun 1963, dan kemudian dikukuhkan dengan Keputusan Presiden Republik Indonesia Nomor 196 Tahun 1963 tertanggal 23 September 1963.",
            "Universitas Negeri Surabaya (disingkat UNESA) adalah Perguruan Tinggi Negeri di Kota Surabaya, Jawa Timur, Indonesia. Didirikan pada 19 Desember 1964.UNESA menempati peringkat ke-19 dalam klasterisasi pemeringkatan perguruan tinggi 2020 oleh Kementerian Pendidikan dan Kebudayaan Republik Indonesia.",
            "Universitas Pendidikan Indonesia (UPI) adalah salah satu kampus unggulan di Indonesia. Universitas Pendidikan Indonesia (UPI) sebelumnya bernama IKIP Bandung. Universitas Pendidikan Indonesia (UPI) didirikan pada 20 Oktober 1954. Universitas Pendidikan Indonesia (UPI) salah satu Perguruan Tinggi Negeri di Indonesia yang berdiri sejak tahun 1954.",
            "Sejarah Pendidikan Tinggi Teknik di Indonesia berawal pada abad ke-20, ketika pemerintah kolonial Belanda mendirikan de Techniche Hoogeschool te Bandung (TH) pada 3 Juli 1920 di lahan seluas 30 hektar di Bandung. Saat itu hanya terdapat satu fakultas yaitu de Faculteit van Technische Wetenschap dan hanya satu jurusan yaitu de afdeeling der We gen Waterbouw. Pendirian perguruan tinggi ini dimaksudkan untuk memenuhi kebutuhan tenaga teknik yang semakin terbatas pada masa kolonial Belanda akibat pecahnya Perang Dunia pertama.",
            "Institut Pertanian Bogor adalah perguruan tinggi yang menghasilkan inovasi-inovasi yang kualitasnya diakui secara nasional maupun internasional.  Selama sepuluh tahun berturut-turut (tahun 2008-2018), Inovasi IPB adalah yang  terbanyak diantara perguruan tinggi lain di Indonesia berdasarkan hasil penilaian Business Innovation Center – Kementerian Riset, Teknologi dan Pendidikan Tinggi RI dalam Inovasi Indonesia Paling Prospektif (sebanyak 39,71 persen).",
            "Politeknik Elektronika Negeri Surabaya secara resmi berdiri sejak tahun 1988. Sebagai sebuah perguruan tinggi politeknik, PENS menyelenggarakan pendidikan vokasi / terapan yang lebih banyak berorientasi pada praktik ketimbang teori. PENS adalah satu-satunya politeknik yang mengkhususkan diri pada bidang teknik elektro.",
    };

    private static int[] fotoKampus={
            R.drawable.ui,
            R.drawable.ugm,
            R.drawable.unair,
            R.drawable.its,
            R.drawable.ub,
            R.drawable.unesa,
            R.drawable.upi,
            R.drawable.itb,
            R.drawable.ipb,
            R.drawable.pens
    };

    static ArrayList<Kampus> getListData(){
        ArrayList<Kampus> list = new ArrayList<>();

        for (int i=0;i<namaKampus.length;i++){
            Kampus kampus = new Kampus();

            kampus.setName(namaKampus[i]);
            kampus.setDetail(detailKampus[i]);
            kampus.setPhoto(fotoKampus[i]);
            list.add(kampus);
        }
        return list;
    }
}
