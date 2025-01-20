Set-bu  unikal elementlarni o'zida saqalaydi.Unda bir xil elementlar takrorlanmaydi.
Setlar ma'lumotlarni tartibsiz saqlayd, ya'ni elementlar o'rni bilan ishlash imkoni yo'q
Setlar Java Collections Frameworkga kiradi va asosan HashSet va TreeSet kabi sinflarda mavjud bo‘ladi.
- Setlar va ularning asosiy xususiyatlari
   - Unikal qiymatlar: Setda takroriy elementlar bolmaydi.
   - Tartibsizlik:Setlar o'zlaridagi elementlarni tartibga solmaydi agarda tarib bilan kiritilmasa
   - O'zgarmas o'lcham:Setga qo'shish yoki o'chrish amalga oshirilganda, faqat unikal qiymatlar saqlanadi.
- Java Set interfeysi va sinflari
   - Hashset-Set interfeysining  eng keng tarqalgan sinfi. Elementlar hashing orqali joylanadi, Bu eng tez qidruv va qo'shish imkonini beradi. Tartib saqlanmaydi.
   - TreeSet-Elementlar tabiiy tartibda yoki Comprator yordamida tartiblaydi. O'rtacha Tezlikda ishlaydi.
   - LinkedHashSet-Hashset bilan o'xshash, lekin elementlarni kiritish tartibida saqlaydi.