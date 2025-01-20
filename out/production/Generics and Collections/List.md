List-bu Java Collections Framework(JCF) tarkibidagi  interface bolib, u tartiblanmagan ma'lumotlar to'plamini saqlash uchun ishlatiladi.
-Listing xususiyatlari
1.tartiblangan saqlash:Listga qo'shilgan element ketma ketlikda saqlanadi.
2.Takrorlanadigan elementlar.Bir xil elementlarni bir necha marta qo'shish mumkin
3. Indekslangan kirish: Harbir element indeks orqali(0 dan boshlanadi).
4. Turli Impeltasiyalar
   - ArrayList:Dynamic array
   - LinkedList elementlarni zanjir shaklida yasaydi
     - Vector: Thread-safe implentatisiya
       Metod	Tavsif
       add(E e)	Element qo‘shadi.
       add(int index, E e)	Belgilangan indeksga element qo‘shadi.
       get(int index)	Belgilangan indeksdagi elementni qaytaradi.
       set(int index, E e)	Belgilangan indeksdagi elementni almashtiradi.
       remove(int index)	Belgilangan indeksdagi elementni o‘chiradi.
       size()	Listdagi elementlar sonini qaytaradi.
       contains(Object o)	Element mavjudligini tekshiradi.
       isEmpty()	List bo‘shligini tekshiradi.
       clear()	Barcha elementlarni o‘chiradi.