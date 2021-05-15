Vue.component('user-row',{
    template:'<div>{{usery.id}}, {{usery.name}} </div>',
    props: ['usery']
});

Vue.component('usery-list', {
    template: '<div> <user-row v-for="usery in messages" :key="usery.id" :usery="usery" /></div>',
    props: ['messages']
});

var app = new Vue({
    el: '#app',
    template: '<usery-list :messages="messages"  />',
    data: {
        messages: [
            {id:"1",name:"a"},
            {id:"2",name:"b"},
]
    }
});