const controle = document.querySelectorAll(".controle-ajuste")

controle.forEach((elemento)=>{
    elemento.addEventListener("click", (evento)=> {
       manipulaDados(evento.target.textContent , evento.target.parentNode)
    
    })
})

function manipulaDados(operacao , controle){
    const peca = controle.querySelector(".controle-contador")
    if(operacao ==="-"){
        peca.value = parseInt(peca.value) - 1
    }else{
        peca.value = parseInt(peca.value) + 1
    }
}

/*function manipulaDados(operacao, controle){
    
    const peca = controle.querySelector(".controle-contador")

    if(operacao === "-"){
        peca.value = parseInt(peca.value) - 1
    }else{
        peca.value = parseInt(peca.value) + 1
    }
}*/

robotron.addEventListener("click",  ()=>{
    console.log("Cliquei no robo")
})

robotron.addEventListener("click" , (evento)=>{
    console.log(evento)
})