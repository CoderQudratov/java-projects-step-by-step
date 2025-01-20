Map-bu kalit qiymat juftliklari saqlovchi ma'lumot tuzilmasi bo'lib, har bir faqat bir marta mavjud bo'lishi mumkin .Mapdagi har bir element ikkita qismdan iborat: kalit(key) va qiymat (value)
Javada Map interfiyasi va uni amalga oshiruvchi bir nechta sinflar mavjud,masalan:
  - Hashmap
  - TreeSet
  - LinkdenHashMap
Mapdagi kalitlar unikal bo'lishi kerak, ya'ni bir kalitni necha qo'shish mumkin emas.

Mapning asosiy Xususiyatlari
 1. HashMap:
    - Taribsiz(underded) Map.
    - Kalit va qiymat juftliklarni kiritish va qidrish uchun tezkor operatsiyalarni taqdim etadi.
    - Null kalitlar va null qiymatlari
 2. TreeMap
    - Tabiiy Tartibda yoki Comprator orqali Tartiblanadi (o'rtacha O(log n) vaqt murakkabligi bilan ishlaydi).
    - Null kalitlar va null qiymatlarini qo'llab quvatlamaydi
 3. LinkedHashMap:
    - HashMap bilan o'xshash, lekin qo'shish tartibida saqlaydi
    - Null kalitlar va null qiymatlarni qo‘llab-quvvatlaydi.
    - 
Map interfeysining asosiy metodlari:
 1. put(K key,V value):
    - Tavsif: Mapga yangi kalit-qiymat juftligini qo'shadi. Agar kalit allaqachon bo'ls, qiymatni yangilaydi
    - Natija: Agar yangi juftlik qo'shilsa, eski qiymat qaytariladi, aks holda null qaytariladi.
    - 