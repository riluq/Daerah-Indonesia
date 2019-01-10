## LIBRARY ANDROID DATA DAERAH INDONESIA

Library Android untuk mendapatkan data daerah seluruh Indonesia mulai dari
Provinsi, Kabupaten, Kecamatan, dan Kota.

Tersedia juga API untuk kebutuhan lainnya.

### Gradle

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

```groovy
dependencies {
        implementation 'com.github.farizdotid:Daerah-Indonesia:2.0.0'
}
```

### Cara Penggunaan Library

```groovy
 private lateinit var daerahIndonesiaHelper: DaerahIndonesiaHelper

 daerahIndonesiaHelper = DaerahIndonesiaHelper(this)
```

### PROVINSI
---

**REQUEST Semua Provinsi**

```groovy
daerahIndonesiaHelper.requestAllProvinsi()
```

**REQUEST Provinsi By ID**

```groovy
daerahIndonesiaHelper.requestSingleProvinsiById({id_provinsi})

contoh :
daerahIndonesiaHelper.requestSingleProvinsiById(32)
```

**REQUEST Provinsi By Name**

```groovy
daerahIndonesiaHelper.requestProvinsiByName({nama_provinsi})

contoh :
daerahIndonesiaHelper.requestProvinsiByName("Jawa")
```

**GET Data Provinsi**

```groovy
daerahIndonesiaHelper.getAllProvinsi() -> Return List
```

**GET ID Provinsi**

```groovy
daerahIndonesiaHelper.getIdProvinsi() -> Return Int
```

**GET Nama Provinsi**

```groovy
daerahIndonesiaHelper.getNameProvinsi() -> Return String
```

### KABUPATEN
---

**REQUEST Kabupaten bedasarkan ID Provinsi**

```groovy
daerahIndonesiaHelper.requestKabupaten({id_provinsi})

contoh :
daerahIndonesiaHelper.requestKabupaten(32)
```

**REQUEST Kabupaten by ID**

```groovy
daerahIndonesiaHelper.requestKabupatenById({id_provinsi}, {id_kabupaten})

contoh :
daerahIndonesiaHelper.requestKabupatenById(32, 3214)
```

**REQUEST Kabupaten by Name**

```groovy
daerahIndonesiaHelper.requestKabupatenByName({id_provinsi}, {nama})

contoh :
daerahIndonesiaHelper.requestKabupatenByName(32, "Purwakarta")
```

**GET Semua Kabupaten**

```groovy
daerahIndonesiaHelper.getAllKabupaten() -> Return List
```

**GET ID Kabupaten**

```groovy
daerahIndonesiaHelper.getIdKabupaten() -> Return Int
```

**GET Nama Kabupaten**

```groovy
daerahIndonesiaHelper.getNameKabupaten() -> Return String
```

### KOTA
---

**REQUEST Kota bedasarkan ID Kecamatan**

```groovy
daerahIndonesiaHelper.requestKota({id_kecamatan})

contoh :
daerahIndonesiaHelper.requestKota(3214010)
```

**REQUEST Kota by ID**

```groovy
daerahIndonesiaHelper.requestKotaById({id_kecamatan}, {id_kota})

contoh :
daerahIndonesiaHelper.requestKotaById(3214, 3214010008)
```

**REQUEST Kota by Name**

```groovy
daerahIndonesiaHelper.requestKotaByName({id_kecamatan}, {nama})

contoh :
daerahIndonesiaHelper.requestKotaByName(3214, "Jatiluhur")
```

**GET Semua Kota**

```groovy
daerahIndonesiaHelper.getAllKota() -> Return List
```

**GET ID Kota**

```groovy
daerahIndonesiaHelper.getKotaId() -> Return Int
```

**GET Nama Kecamatan**

```groovy
daerahIndonesiaHelper.getKotaName() -> Return String
```

**CATATAN :**
Request terlebih dahulu lalu bisa mendapatkan datanya seperti ID atau Nama

---

### Changelog

#### 2.0.0 | 10-01-2018
* Function Provinsi
* Function Kabupaten
* Function Kecamatan
* Function Kota

---
### API - POSTMAN

Jika hanya butuh API saja kalian bisa download atau import dari link ini :
https://www.getpostman.com/collections/711d0a1a35258891849b