function getRetirementYears(age) {
    if (age % 2 === 0) {
        return 13;
    } else {
        return 15;
    }
}

function getRoygbivColor() {
    let color;
    do {
        color = prompt("Enter your favorite ROYGBIV color. If you do not know what ROYGBIV is, enter 'Help'");
        if (color.toLowerCase() === 'quit') {
            alert("Nobody likes a quitter...");
            throw "User quitted!";
        } else if (color.toLowerCase() === 'help') {
            alert("ROYGBIV is an acronym for the sequence of hues in a rainbow: Red, Orange, Yellow, Green, Blue, Indigo, Violet.");
        }
    } while (color.toLowerCase() === 'help');
    return color;
}

function tellFortune(firstName, lastName, age, birthMonth, color, siblings) {
    let retirementYears = getRetirementYears(age);
    return `${firstName} ${lastName}, at ${age}, you chose the color ${color}, born in ${birthMonth} and have ${siblings} siblings. You will retire in ${retirementYears} years.`;
}

function main() {
    try {
        alert("Welcome to the Fortune Teller!");

        let firstName = prompt('Enter your first name: ');
        if (firstName.toLowerCase() === 'quit') {
            alert("Nobody likes a quitter...");
            throw "User quitted!";
        }

        let lastName = prompt('Enter your last name: ');
        if (lastName.toLowerCase() === 'quit') {
            alert("Nobody likes a quitter...");
            throw "User quitted!";
        }

        let age = prompt('Enter your age: ');
        if (age.toLowerCase() === 'quit') {
            alert("Nobody likes a quitter...");
            throw "User quitted!";
        }
        age = parseInt(age);

        let birthMonth = prompt('Enter your birth month (as an integer, 1 for January, 12 for December): ');
        if (birthMonth.toLowerCase() === 'quit') {
            alert("Nobody likes a quitter...");
            throw "User quitted!";
        }
        birthMonth = parseInt(birthMonth);

        let color = getRoygbivColor();

        let siblings = prompt('Enter the number of your siblings: ');
        if (siblings.toLowerCase() === 'quit') {
            alert("Nobody likes a quitter...");
            throw "User quitted!";
        }
        siblings = parseInt(siblings);

        let fortune = tellFortune(firstName, lastName, age, birthMonth, color, siblings);
        alert('Your fortune is:\n' + fortune);
    } catch (error) {
        console.log(error);
    }
}

main();

