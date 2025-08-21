const html = document.querySelector('html')
const focoBT = document.querySelector('.app__card-button--foco')
const curtoBT = document.querySelector('.app__card-button--curto')
const longoBT = document.querySelector('.app__card-button--longo')
const banner = document.querySelector('.app__image')
const titulo = document.querySelector('.app__title')
const startPauseBT = document.querySelector('#start-pause')
//variavel para tirar o foco dos botões.
const botoes = document.querySelectorAll('.app__card-button')
//musica
const musicaFocoInput = document.querySelector('#alternar-musica')
const musica = new Audio('/sons/luna-rise-part-one.mp3')

let tempoDecorridoEmSegundos = 5
let intervaloId = null

musica.loo = true
//função para musica com função anonima
musicaFocoInput.addEventListener('change', () =>{
    if(musica.paused){
        musica.play()
    }else{
        musica.pause()
    }
})

focoBT.addEventListener('click', () =>{
    alterarContexto('foco')
    //para dar foco no botão
    focoBT.classList.add('active')
})

curtoBT.addEventListener('click', () =>{
    alterarContexto('descanso-curto')
    //para dar foco no botão
    curtoBT.classList.add('active')
})

longoBT.addEventListener('click', () =>{
    alterarContexto('descanso-longo')
    //para dar foco no botão
    longoBT.classList.add('active')
})

function alterarContexto(contexto){
    //fazendo a remoção do active com o foreach
    botoes.forEach(function (contexto){
        contexto.classList.remove('active')
    })

    html.setAttribute('data-contexto', contexto)
    banner.setAttribute('src',`/imagens/${contexto}.png`)
    switch (contexto) {
        case "foco":
                titulo.innerHTML = `
                Otimize sua produtividade,<br>
                <strong class="app__title-strong">mergulhe no que importa.</strong>
                `
            break;
        case "descanso-curto":
            titulo.innerHTML = `
                Que tal dar uma respirada,<br>
                <strong class="app__title-strong">Faça uma pausa curta!</strong>
            `
            break;
        case "descanso-longo":
            titulo.innerHTML = `
            Hora de voltar a superfície,<br>
                <strong class="app__title-strong">Faça uma pausa longa.</strong>
            `
        default:
            break;
    }
}

const contagemRegressiva = () => {
    //iniciar()
    tempoDecorridoEmSegundos -= 1
    console.log('Temporizador: '+ tempoDecorridoEmSegundos)
}

startPauseBT.addEventListener('click', contagemRegressiva)

function iniciar(){
    intervaloId = setInterval(contagemRegressiva, 1000)
}