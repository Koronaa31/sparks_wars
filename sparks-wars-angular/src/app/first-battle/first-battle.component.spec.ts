import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FirstBattleComponent } from './first-battle.component';

describe('FirstBattleComponent', () => {
  let component: FirstBattleComponent;
  let fixture: ComponentFixture<FirstBattleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FirstBattleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FirstBattleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
