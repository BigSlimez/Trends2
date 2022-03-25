let orders = [];

document.getElementById("formOrder").addEventListener("submit", event => {
    event.preventDefault();


    let voornaam = document.getElementById("voornaam").value;
    let naam = document.getElementById("naam").value;
    let email = document.getElementById("email").value;
    let leeftijd = document.getElementById("leeftijd").value;
    let ticket = document.querySelector('input[name=ticket]:checked').value;
    let bonnetjes = document.getElementById("bonnetjes").value;

    let bestelling = {
        voornaam,
        naam,
        email,
        leeftijd,
        ticket,
        bonnetjes
    }

    console.log(bestelling);
    saveOrder(bestelling);
});


function saveOrder(bestelling) {
    orders.push(bestelling);
    localStorage.setItem('order', JSON.stringify(orders));

}