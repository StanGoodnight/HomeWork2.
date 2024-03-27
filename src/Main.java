class Scratch { public static void main(String[] args) {

        var dog = 8;
        System.out.println("Собак - " + dog);

        var cat = 3.6;
        System.out.println("Кошек - " + cat);

        var paper = 763789;
        System.out.println("Бумаги - " + paper);

        dog = dog + 4;
        System.out.println("Собак - " + dog);

        cat = cat + 4;
        System.out.println("Кошек - " + cat);

        paper = paper + 4;
        System.out.println("Бумаги - " + paper);

        var a = dog;
        var b = 3.5;
        System.out.println("Собак - " + (a - b));

        var c = cat;
        var d = 1.6;
        System.out.println("Кошек - " + (c - d));

        var e = paper;
        var f = 7639;
        System.out.println("Бумаги - " + (e - f));

        var friend = 19;
        System.out.println("друзей - " + friend);

        friend = friend + 2;
        System.out.println("Друзей - " + friend);

        friend = friend / 7;
        System.out.println("Друзей - " + friend);

        var frog = 3.5;
        System.out.println("Лягушек - " + frog);

        frog = frog * 10;
        System.out.println("Лягушек - " + frog);

        frog = frog / 3.5;
        System.out.println("Лягушек - " + frog);

        frog = frog + 4;
        System.out.println("Лягушек - " + frog);

        var boxerWeight1 = 78.2;
        System.out.println("Масса первого боксёра = " + boxerWeight1);

        var boxerWeight2 = 82.7;
        System.out.println("Масса второго боксёра = " + boxerWeight2);

        var boxerWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Масса двух боксёров = " + boxerWeight);

        var boxerWeightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница веса боксеров = " + boxerWeightDifference);

        var boxersOverload = (boxerWeight2 + boxerWeight1) % boxerWeightDifference;
        System.out.println("Остаток от деления - " + boxersOverload);

        var generallyHours = 640;
        var hourPerEmployee = 8;
        var totalEmployeesInTheCompany = generallyHours / hourPerEmployee;
        System.out.println("Всего работников в компании - " + totalEmployeesInTheCompany + " человек" );

        var employeesCameToTheCompany = 94;

        var becameEmployees = totalEmployeesInTheCompany + employeesCameToTheCompany;
        System.out.println("Стало сотрудников - " + becameEmployees);

        var hoursForAllEmployees = generallyHours / becameEmployees;
        System.out.println("Если в компании работает - " + becameEmployees + " человека, то всего " + hoursForAllEmployees + " часа работы может быть поделено между сотрудниками." );

    }
        }