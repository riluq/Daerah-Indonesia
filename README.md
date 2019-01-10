## LIBRARY ANDROID DATA DAERAH INDONESIA

Library Android untuk mendapatkan data daerah seluruh Indonesia mulai dari
Provinsi, Kabupaten, Kecamatan, dan Kota.

Tersedia juga API untuk kebutuhan lainnya.

### Gradle

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

```
dependencies {
        implementation 'com.github.farizdotid:Daerah-Indonesia:2.0.0'
}
```

### Cara Penggunaan Library

```
 private lateinit var daerahIndonesiaHelper: DaerahIndonesiaHelper

 daerahIndonesiaHelper = DaerahIndonesiaHelper(this)
```

#### PROVINSI

**REQUEST Semua Provinsi**

```
daerahIndonesiaHelper.requestAllProvinsi()
```

**REQUEST Provinsi By ID**

```
daerahIndonesiaHelper.requestSingleProvinsiById({id_provinsi})

contoh :
daerahIndonesiaHelper.requestSingleProvinsiById(32)
```

**REQUEST Provinsi By Name**

```
daerahIndonesiaHelper.requestProvinsiByName({nama_provinsi})

contoh :
daerahIndonesiaHelper.requestProvinsiByName("Jawa")
```

**GET Data Provinsi**

```
daerahIndonesiaHelper.getAllProvinsi() -> Return List
```

**GET ID Provinsi**

```
daerahIndonesiaHelper.getIdProvinsi() -> Return Int
```

**GET Nama Provinsi**

```
daerahIndonesiaHelper.getNameProvinsi() -> Return String
```

#### KABUPATEN

**REQUEST Kabupaten bedasarkan ID Provinsi**

```
daerahIndonesiaHelper.requestKabupaten({id_provinsi})

contoh :
daerahIndonesiaHelper.requestKabupaten(32)
```

**REQUEST Kabupaten by ID**

```
daerahIndonesiaHelper.requestKabupatenById({id_provinsi}, {id_kabupaten})

contoh :
daerahIndonesiaHelper.requestKabupatenById(32, 3214)
```

**REQUEST Kabupaten by Name**

```
daerahIndonesiaHelper.requestKabupatenByName({id_provinsi}, {nama})

contoh :
daerahIndonesiaHelper.requestKabupatenByName(32, "Purwakarta")
```

**GET Semua Kabupaten**

```
daerahIndonesiaHelper.getAllKabupaten() -> Return List
```

**GET ID Kabupaten**

```
daerahIndonesiaHelper.getIdKabupaten() -> Return Int
```

**GET Nama Kabupaten**

```
daerahIndonesiaHelper.getNameKabupaten() -> Return String
```

#### KOTA

**REQUEST Kota bedasarkan ID Kecamatan**

```
daerahIndonesiaHelper.requestKota({id_kecamatan})

contoh :
daerahIndonesiaHelper.requestKota(3214010)
```

**REQUEST Kota by ID**

```
daerahIndonesiaHelper.requestKotaById({id_kecamatan}, {id_kota})

contoh :
daerahIndonesiaHelper.requestKotaById(3214, 3214010008)
```

**REQUEST Kota by Name**

```
daerahIndonesiaHelper.requestKotaByName({id_kecamatan}, {nama})

contoh :
daerahIndonesiaHelper.requestKotaByName(3214, "Jatiluhur")
```

**GET Semua Kota**

```
daerahIndonesiaHelper.getAllKota() -> Return List
```

**GET ID Kota**

```
daerahIndonesiaHelper.getKotaId() -> Return Int
```

**GET Nama Kecamatan**

```
daerahIndonesiaHelper.getKotaName() -> Return String
```

**CATATAN :**
Request terlebih dahulu lalu bisa mendapatkan datanya seperti ID atau Nama

## Changelog

### 2.0.0 | 10-01-2018
* Function Provinsi
* Function Kabupaten
* Function Kecamatan
* Function Kota
