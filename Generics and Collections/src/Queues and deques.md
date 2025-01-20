Queues va Deques (Navbatlar va Ikki tomondan ishlov beriladigan navbatlar)
Queue (Navbat)
Queue — bu FIFO (First In, First Out) prinsipiga asoslangan ma'lumotlar tuzilmasi bo‘lib, bunda ma'lumotlar qo‘shilgan tartibda o‘qiladi. Ya'ni, birinchi bo‘lib qo‘shilgan element birinchi bo‘lib olinadi.

Queueda ikkita asosiy operatsiya mavjud:

enqueue (add): Yangi elementni navbatning oxiriga qo‘shish.
dequeue (remove): Navbatning boshidan birinchi elementni olib tashlash.
Queue yordamida ma'lumotlar ketma-ketlikda ishlov beriladi. Masalan, chopish, xizmat ko‘rsatish, ma'lumotlar oqimi boshqaruvi kabi holatlarda Queue ishlatiladi.

Queue interfeysi va asosiy metodlari:
add(E e):

Tavsif: Elementni navbatning oxiriga qo‘shadi.
Natija: Agar muvaffaqiyatli qo‘shilgan bo‘lsa, true qaytaradi, aks holda IllegalStateException tashlaydi.
offer(E e):

Tavsif: Elementni navbatning oxiriga qo‘shadi (yangi elementni muvaffaqiyatli qo‘shish yoki false qaytarish).
Natija: Agar navbat to‘liq bo‘lmasa, true qaytaradi, aks holda false.
remove():

Tavsif: Navbatning boshidan birinchi elementni olib tashlaydi.
Natija: Agar navbat bo‘sh bo‘lmasa, olib tashlangan elementni qaytaradi, aks holda NoSuchElementException tashlaydi.
poll():

Tavsif: Navbatning boshidan birinchi elementni olib tashlaydi (agar mavjud bo‘lsa).
Natija: Agar navbat bo‘sh bo‘lsa, null qaytaradi.
peek():

Tavsif: Navbatning boshidagi elementni qaytaradi, lekin uni olib tashlamaydi.
Natija: Agar navbat bo‘sh bo‘lsa, null qaytaradi.
element():

Tavsif: Navbatning boshidagi elementni qaytaradi, lekin uni olib tashlamaydi.
Natija: Agar navbat bo‘sh bo‘lsa, NoSuchElementException tashlaydi.

Deque (Ikki tomondan ishlov beriladigan navbat)
Deque (Double-Ended Queue) — bu ikkala tomondan ham elementlar qo‘shish va olib tashlash imkonini beruvchi ma'lumotlar tuzilmasidir. Deque-da elementlar faqat bir tomondan emas, balki ikkala tomondan ham qo‘shilishi va o‘qilishi mumkin.

Deque-da ikkita asosiy operatsiya mavjud:

addFirst(E e): Elementni navbatning boshiga qo‘shadi.
addLast(E e): Elementni navbatning oxiriga qo‘shadi.
removeFirst(): Navbatning boshidan birinchi elementni olib tashlaydi.
removeLast(): Navbatning oxiridan oxirgi elementni olib tashlaydi.
Deque yordamida elementlar ikki tomondan boshqariladi va uni FIFO va LIFO (Last In, First Out) prinsiplariga mos ravishda ishlatish mumkin.

Deque interfeysi va asosiy metodlari:
addFirst(E e):

Tavsif: Elementni navbatning boshiga qo‘shadi.
Natija: Muvaffaqiyatli qo‘shilishdan so‘ng true qaytaradi, aks holda IllegalStateException tashlanadi.
addLast(E e):

Tavsif: Elementni navbatning oxiriga qo‘shadi.
Natija: Muvaffaqiyatli qo‘shilishdan so‘ng true qaytaradi, aks holda IllegalStateException tashlanadi.
removeFirst():

Tavsif: Navbatning boshidan elementni olib tashlaydi.
Natija: Agar navbat bo‘sh bo‘lmasa, olib tashlangan elementni qaytaradi, aks holda NoSuchElementException tashlaydi.
removeLast():

Tavsif: Navbatning oxiridan elementni olib tashlaydi.
Natija: Agar navbat bo‘sh bo‘lmasa, olib tashlangan elementni qaytaradi, aks holda NoSuchElementException tashlaydi.
peekFirst():

Tavsif: Navbatning boshidagi elementni qaytaradi, lekin uni olib tashlamaydi.
peekLast():

Tavsif: Navbatning oxiridagi elementni qaytaradi, lekin uni olib tashlamaydi.