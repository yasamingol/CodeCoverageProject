# آزمایش ۷ مهندسی نرم‌افزار
## پروزه json-simple
در این بخش از پروژه ما روالی که در مستندات ارائه شده در ریپازیتوری درس ارائه شد پیش رفتیم.
### گرفتن test coverage از پروژه

![image_2023_12_22T15_50_16_697Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/bfacc72e-f01c-4936-9402-de301f6ee08d)

### مشاهده درصد پوشایی تست‌ها جلوی اسم کلاس‌ها

![image_2023_12_22T15_54_33_787Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/5dad0755-0db3-47ed-beaf-a20feb518b66)

### گرفتن خروجی گزارش با فرمت html

![image_2023_12_22T15_51_50_877Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/38262916-54c3-459e-9391-e67496ae324a)


### مشاهده کردن پوشش دهی کد با کلیک بر هر لینک فایل

![image_2023_12_22T15_53_18_767Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/c0aeadd4-ab36-429a-9fe2-39748cd692dc)

## پروژه code coverage
در این پروژه قصد داریم که میزان پوشش آزمون برای بخش های مختلف کد را افزایش دهیم. برای این منظور ابتدا با کمک مراحل توصیف شده در دستور العمل آزمایش، test coverage کد ابتدایی را بررسی میکنیم.

در ادامه متناظر با هر کدام از کلاس های موجود در این پروژه، تست هایی را اضافه میکنیم تا بتوانیم این مقدار پوشش آزمون سنجیده شده ی قبلی را افزایش دهیم. برخی از کلاس ها، از همان ابتدا تست داشتند که در این موارد ما تعدادی تست به آن اضافه میکنیم؛ در باقی کلاس هایی که کلا تستی وجود نداشت، نظیر هر کلاس یک کلاس تست نیز ساخته ایم و تست های مربوط به هر کلاس را منطبق با ساختار و فانشکن های آن کلاس نوشته ایم. تست های اضافه شده در هر کلاس را به ترتیب در ادامه آورده ایم (توجه داشته باشید که عنوان هر تست نشان می دهد که چه فرایندی از کلاس مورد آزمایش قرار گرفته است)
### تست های TrafficBehaviorService و پاس شدن آنها

![image_2023_12_21T09_25_17_836Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/5b1b8c39-25a5-4b9c-8389-cd1a0e5574dc)
![image_2023_12_21T09_24_51_286Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/a7e10048-8e5d-4c75-b987-d4b0ba3262ed)
![image_2023_12_21T09_25_06_837Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/f3b0d61b-d621-4452-a155-03c07216376e)
![image_2023_12_21T09_26_15_738Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/735282eb-585c-465d-af4f-2fd95cc85a20)

### تست های کلاس PersonService و پاس شدن آنها

![image_2023_12_21T10_01_14_853Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/a736afaf-5a63-46d2-bec7-c65596800da4)
![image_2023_12_21T10_01_43_802Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/99449582-8fed-41ea-a9b8-75abb808cb47)
![image_2023_12_21T10_00_55_930Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/88c6e5a5-2fa7-45a7-9bfb-559cf0eb70d6)

### تست های کلاس FootPassenger و پاس شدن آنها
![image_2023_12_21T10_12_35_775Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/61bf0deb-faaf-4870-a86d-7394418836c8)
![image_2023_12_21T10_13_17_665Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/fa6a4bef-e8bf-498b-a4a2-b74dde94aad9)
![image_2023_12_21T10_12_23_871Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/698ab469-1d3c-4c5f-aa7a-d454f51d103a)

### تست های کلاس Person و پاس شدن آنها
![image_2023_12_21T10_24_11_639Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/22aeca1c-c3b4-4c2e-a731-7c3e3a95672f)
![image_2023_12_21T10_24_19_066Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/3c317d0f-5905-475b-86f8-454601158968)
![image_2023_12_21T10_24_49_169Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/1cde81eb-a73f-4862-8d16-f7b47e035d9b)
![image_2023_12_21T10_24_01_712Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/ed517cdd-9db6-4d3b-a906-5ac4d9a168fa)

### تست های کلاس Traffic و پاس شدن آنها

![image_2023_12_21T10_50_16_038Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/4e199bb0-5593-4a6c-8dac-af1216302f05)
![image_2023_12_21T10_52_17_500Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/19932439-c74f-41d7-8039-73dcf369efd4)
![image_2023_12_21T10_50_07_194Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/af7dfe0d-f77e-43ad-901b-0fb911bf50d1)

### تست های کلاس PersonValidator و پاس شدن آنها
![image_2023_12_21T11_25_51_646Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/46b4532d-4f1b-4adf-9006-ee76b52e72cb)
![image_2023_12_21T11_24_51_946Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/a0fa4db4-8259-4d91-b99c-b2484e542e70)
![image_2023_12_21T11_25_23_980Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/21bb1788-d2be-4e8c-9944-5d8092f6031e)
![image_2023_12_21T11_25_02_705Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/525dd8b5-f30c-4dc9-ab3a-6b10c82b840b)


![image_2023_12_21T11_25_12_616Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/2a584b0d-c3e5-458c-8e92-0af7c438487c)

### تست های کلاس PersonRepository و پاس شدن آنها
![image_2023_12_21T11_46_46_729Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/363fc1e1-9466-44ba-8766-cb16435ce582)
![image_2023_12_21T11_46_55_209Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/ba65ceb3-b5a9-4949-b8b2-66ba817ea3e4)
![image_2023_12_21T11_47_03_181Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/d387f01d-0fdb-4279-8c3c-0ffc0e7449aa)
![image_2023_12_21T11_47_35_061Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/81d5c040-59d7-4ab1-ace3-694e8c632efe)
![image_2023_12_21T11_46_36_943Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/bfa85408-e5ad-47dc-8219-697d7bdc09ab)

### پاس شدن کل فایل تست‌ها
![image_2023_12_21T11_50_30_864Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/676b0d95-4118-434e-9028-246707b8db79)

### بررسی ران شدن درست و صحت کد اصلی پروژه

![image_2023_12_21T11_51_29_381Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/818eeddf-3d3e-4b86-a45a-a4b53aa8faf2)

### گرفتن test coverage از پروژه و مشاهده درصد پوشایی تست‌ها در جلوی اسم کلاس‌ها


![image_2023_12_22T16_14_41_590Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/abb69b7c-24e1-40e0-bd1c-c1cbae1d472c)

### گرفتن خروجی با فرمت html

![image_2023_12_22T16_17_31_341Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/5f3d1147-d581-4873-b2b8-aa556467b2c5)

### مشاهده پوشایی تست‌ها بر روی خط به خط کد
![image_2023_12_22T16_20_00_830Z](https://github.com/yasamingol/CodeCoverageProject/assets/59218135/2e028fbd-a433-4a98-a282-5476ea253fce)



